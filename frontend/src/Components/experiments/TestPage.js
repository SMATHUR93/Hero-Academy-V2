import React, { Component } from "react";
import "./TestPage.css";

class Employee extends React.Component {

    constructor(props){
        super(props);
    }

    render() {
        return (
          <div>
            <p>{this.props.fname} {this.props.lname} - {this.props.age} years -  {this.props.department}</p>
            {/* <button onClick={this.buy}>Buy</button>
            <button onClick={this.show}>Show</button>
            <h3>Quantity : {this.state.quantity} Item(s)</h3> */}
            <hr/>
          </div>
        );
    }

}

class EmployeeForm extends  React.Component {

    constructor(props){
        super(props);
        this.submit = this.submit.bind(this);
    }

    submit(e){
        e.preventDefault();
        console.log("First Name = "+this.refs.fname.value);
        console.log("Last Name = "+this.refs.lname.value);
        console.log("Age = "+this.refs.age.value);
        console.log("Department = "+this.refs.department.value);
        var employee = {
            fname : this.refs.fname.value,
            lname : this.refs.lname.value,
            age : parseInt(this.refs.age.value),
            department : this.refs.department.value,
        };
        this.props.handleCreateEmployee(employee);
        this.refs.fname.value = "";
        this.refs.lname.value = "";
        this.refs.age.value = "";
        this.refs.department.value = "";
    }

    render(){
        return(
            <form onSubmit={this.submit}>
                <br/>
                <input type="text" placeholder="Employee First Name" ref="fname"/>
                <input type="text" placeholder="Employee Last Name" ref="lname"/>
                <input type="text" placeholder="Age" ref="age"/>
                <input type="text" placeholder="Department" ref="department"/>
                <br/>
                <button>Create Employee</button>
                <hr/>
            </form>
        );
    }

}

class EmployeeList extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            employeeList: [{
                fname: "john",
                lname: "smith",
                age: 21,
                department: "accounting"
            },{
                fname: "perry",
                lname: "white",
                age: 34,
                department: "accounting"
            },{
                fname: "james",
                lname: "black",
                age: 56,
                department: "hr"
            }]
        };
        this.showEmployee = this.showEmployee.bind(this);
        this.createEmployee = this.createEmployee.bind(this);
    }

    showEmployee(employee){
        alert("you selected "+employee.fname+" "+employee.lname);
    }

    createEmployee(employee){
        this.setState({
            employeeList : this.state.employeeList.concat(employee)
        });
    }

    render(){
        var component = this;
        var employees = this.state.employeeList.map(employee => {
            return <Employee fname={employee.fname} lname={employee.lname} age={employee.age} department={employee.department}/>;
        });
        return (
            <div>
                <div><h3>Hello Employees !!!</h3></div>
                <hr/>
                <EmployeeForm handleCreateEmployee={component.createEmployee}/>
                <hr/>
                {employees}
            </div>
        );
    }

}

class TestPage extends React.Component {
    render(){
        return (
            <EmployeeList></EmployeeList>
        );
    }
}

export default TestPage;