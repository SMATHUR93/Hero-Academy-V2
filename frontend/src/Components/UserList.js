import React from "react";
import SearchMenu from "./SearchMenu";
import "../App.css";
// import imgTest from "../../assets/0003.jpg";

class UserList extends React.Component {

    constructor(props){
        super(props);
        this.state = {
            users : [],
            elements : [],
            races : [],
            symbols : [],
            skills: []
        }
        this.getUsers = this.getUsers.bind(this);
        this.getFilters = this.getFilters.bind(this);
        this.sortTableAsc = this.sortTableAsc.bind(this);
        this.sortTableDesc = this.sortTableDesc.bind(this);
        this.filterTable = this.filterTable.bind(this);
    }

    componentDidMount(prevProps, prevState, snapshot){
        console.log("I am observing !!!!");
        this.loadDoc("/api/user", this.getUsers);
        this.loadDoc("/academy/allInformation", this.getFilters);
    }

    loadDoc(url, cFunction) {
        var xhttp;
        xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function() {
          if (this.readyState == 4 && this.status == 200) {
            cFunction(this);
          }
        };
        xhttp.open("GET", url, true);
        xhttp.send();
    }

    getUsers(xhttp) {
		console.log("Fetched Products !!");
		var allUsers = JSON.parse(xhttp.response);
        this.setState({
            users: allUsers
        });
	}
    
	getFilters(xhttp) {
		console.log("Fetched Filters !!");
		var allFilters = JSON.parse(xhttp.response);
		var elementValues = allFilters.elements;
        var raceValues = allFilters.races;
        
        this.setState({
            elements : allFilters.elements,
            races : allFilters.races,
            symbols : allFilters.symbols,
            skills : allFilters.skills
        });
	}

    filterTable(inputValue, inputIndex) {
        var filter, table, tr, td, i, txtValue;
        filter = inputValue.toUpperCase();
        table = document.getElementById("usersListTable");
        tr = table.getElementsByTagName("tr");
        for (i = 0; i < tr.length; i++) {
            td = tr[i].getElementsByTagName("td")[inputIndex];
            if (td) {
                txtValue = td.textContent || td.innerText;
                if (txtValue.toUpperCase().indexOf(filter) > -1) {
                    tr[i].style.display = "";
                } else {
                    tr[i].style.display = "none";
                }
            }       
        }
    }

    sortTableAsc(index) {
        var table, rows, switching, i, x, y, shouldSwitch;
        table = document.getElementById("usersListTable");
        switching = true;
        while (switching) {
            switching = false;
            rows = table.rows;
            for (i = 1; i < (rows.length - 1); i++) {
                shouldSwitch = false;
                x = rows[i].getElementsByTagName("TD")[index];
                y = rows[i + 1].getElementsByTagName("TD")[index];
                if(isNaN(x.innerText) && isNaN(y.innerText)){
                    x = x.innerText.toString();
                    y = y.innerText.toString();
                } else{
                    x = Number.parseInt(x.innerText);
                    y = Number.parseInt(y.innerText);
                } 
                if (x > y) {
                    shouldSwitch = true;
                    break;
                }
            }
            if (shouldSwitch) {
                rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
                switching = true;
            }
        }
    }

    sortTableDesc(index) {
        var table, rows, switching, i, x, y, shouldSwitch;
        table = document.getElementById("usersListTable");
        switching = true;
        while (switching) {
            switching = false;
            rows = table.rows;
            for (i = 1; i < (rows.length - 1); i++) {
                shouldSwitch = false;
                x = rows[i].getElementsByTagName("TD")[index];
                y = rows[i + 1].getElementsByTagName("TD")[index];
                if(isNaN(x.innerText) && isNaN(y.innerText)){
                    x = x.innerText.toString();
                    y = y.innerText.toString();
                } else{
                    x = Number.parseInt(x.innerText);
                    y = Number.parseInt(y.innerText);
                } 
                if (x < y) {
                    shouldSwitch = true;
                    break;
                }               
            }
            if (shouldSwitch) {
                rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
                switching = true;
            }
        }
    }

    render() {
        const {users, races, elements, symbols, skills} = this.state;
        const userList = this;
        let symbolIndex = 0;
        let skillIndex = 0;
        let elementIndex = 0;
        let raceIndex = 0;

        if(Array.isArray(users) && users.length>0 && users[0]){
            Object.getOwnPropertyNames(users[0]).forEach(
                function (val, idx, array) {
                    if(val=="element"){
                        elementIndex = idx;
                    }
                    if(val=="race"){
                        raceIndex = idx;
                    }
                    if(val=="symbol"){
                        symbolIndex = idx;
                    }
                    if(val=="skills"){
                        skillIndex = idx;
                    }
                    console.log(idx + ' -> ' + val + ' -> ' + users[0][val]);
                }
            );
        }

        return (
        <div>
            <div className="header">
                <h2>HERO ACADEMY</h2>
            </div>

            <div className="row viewport">
                <div className="col-3 col-s-3 menu">
                    <h4><span>Filters</span></h4>
                    <ul>
                        <li>
                            <div>
                                <span>AGE</span>
                                &nbsp;&nbsp;&nbsp;
                                <select id="filterByPriceStartInput"></select>   {/* onkeyup="filterByPrice()" */}
                                <select id="filterByPriceEndInput"></select>  {/*  onkeyup="filterByPrice()" */}
                            </div>
                        </li>
                        <li>
                            <div>
                                <span>SYMBOLS</span>
                                &nbsp;&nbsp;&nbsp;
                                <SearchMenu items={symbols} prefix={"symbols"} tableIndex={symbolIndex} filterTable={userList.filterTable}/>
                            </div>
                        </li>
                        <li>
                            <div>
                                <span>SKILLS</span>
                                &nbsp;&nbsp;&nbsp;
                                <SearchMenu items={skills} prefix={"skills"} tableIndex={skillIndex} filterTable={userList.filterTable}/>
                            </div>
                        </li>
                        <li>
                            <div>
                                <span>ELEMENT</span>
                                <table id="elementFilters">
                                    {elements?.map(function(element){
                                        return <tr onClick={() => userList.filterTable(element.name, elementIndex)}>
                                            <td><span className="dot" style={{backgroundColor:element.color}}/></td>
                                            <td>{element.name}</td>
                                        </tr>;
                                    })}
                                </table>
                            </div>
                        </li>
                        <li>
                            <div>
                                <span>RACE</span>
                                <table id="raceFilters">
                                    {races?.map(function(race){
                                        const randomColor = Math.floor(Math.random()*16777215).toString(16);
                                        return <tr onClick={() => userList.filterTable(race.name, raceIndex)}>
                                            <td><span className="dot" style={{backgroundColor:"#"+randomColor}}/></td>
                                            <td>{race.name}</td>
                                        </tr>;
                                    })}
                                </table>
                            </div>
                        </li>
                    </ul>
                </div>

                <div className="col-9 col-s-12">
                    <div className="content">
                        <h2 id="titleBox">USER LIST</h2>
                        <div id="usersListing">
                            <table id="usersListTable">
                                <thead>
                                    <tr>
                                        {users? users[0] ? Object.getOwnPropertyNames(users[0]).map(function(element, index, array){
                                            return <th style={{minWidth:"200px"}}>
                                                <span style={{float:"left"}}>
                                                    {element.toUpperCase()}
                                                </span>
                                                {element==="image"?"":<span style={{float:"right"}}>
                                                    <div className="arrow-up" onClick={() => userList.sortTableAsc(index)}></div>
                                                    <br/>
                                                    <div className="arrow-down" onClick={() => userList.sortTableDesc(index)}></div>
                                                </span>}
                                            </th>;
                                        }): "": ""}
                                    </tr>
                                </thead>
                                <tbody>
                                    {users?.map(function(user){
                                        return <tr>{Object.getOwnPropertyNames(user).map(function(obj, index, array){
                                            if(obj==="image") {
                                                const img = require('../../assets/'+(user[obj].split("/assets/")[1]));
                                                return <td><img className="profileImage" src={img.default}/></td>;
                                            } else if(obj==="race"||obj==="element"||obj==="symbol") {
                                                return <td>{user[obj].name}</td>;
                                            } else if(obj==="skills") {
                                                return <table><tbody>{user[obj].map(function(item){
                                                    return <tr><td>{item.skill.name}</td></tr>;
                                                })}</tbody></table>;
                                            } else{
                                                return <td>{user[obj]}</td>
                                            }
                                        })}</tr>;
                                    })}
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>

            </div>

            <div className="footer">
                <span className="text-muted">&nbsp;&nbsp;Hero Academy version 2.0.0 May 2021.</span>
            </div>

        </div>
        );
    }
}
  
export default UserList;