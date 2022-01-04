import React from "react";
import "./SearchMenu.css";

class SearchMenu extends React.Component {

    constructor(props){
        super(props);
        this.state = {
            users : [],
            elements : [],
            races : [],
            symbols : []
        }
        this.toggleDropdown = this.toggleDropdown.bind(this);
        this.filterFunction = this.filterFunction.bind(this);
        this.onElementClick = this.onElementClick.bind(this);
    }

    toggleDropdown() {
        document.getElementById("myDropdown"+this.props.prefix).classList.toggle("show");
    }
        
    filterFunction() {
        let input, filter;
        input = document.getElementById("myInput"+this.props.prefix);
        filter = input.value.toUpperCase();
        let div, a, i;
        div = document.getElementById("myDropdown"+this.props.prefix);
        a = div.getElementsByTagName("a");
        for (i = 0; i < a.length; i++) {
            let txtValue = a[i].textContent || a[i].innerText;
            if (txtValue.toUpperCase().indexOf(filter) > -1) {
                a[i].style.display = "";
            } else {
                a[i].style.display = "none";
            }
        }
    }

    onElementClick(itemName){
        debugger;
        this.props.filterTable(itemName,this.props.tableIndex);
    }

    render() {
        const items = this.props.items;
        const prefix = this.props.prefix; 
        const component = this;

        return (
            <div class="dropdown">
                <button onClick={this.toggleDropdown} class="dropbtn">{prefix}</button>
                <div id={"myDropdown"+prefix} class="dropdown-content">
                    <input type="text" placeholder="Search.." id={"myInput"+prefix} onKeyUp={this.filterFunction}/>
                    {items?.map(function(item){
                        return (<a onClick={() => component.onElementClick(item.name)}>{item.name}</a>);
                    })}
                </div>
            </div>
        );
    }
}
  
export default SearchMenu;