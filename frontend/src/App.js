import React, { Component } from "react";
import { Route, Routes, BrowserRouter as Router } from "react-router-dom";
import AddUser from "./Components/experiments/materialUIuserlist/AddUser";
import ViewUsers from "./Components/experiments/materialUIuserlist/ViewUsers";
import SearchUsers from "./Components/experiments/materialUIuserlist/SearchUsers";
import ProductList from "./Components/experiments/ProductList";
import TestPage from "./Components/experiments/TestPage";
import EmployeeList from "./Components/experiments/boot/EmployeeList"
import UserList from "./Components/UserList";

class App extends Component {
    render() {
        return (
            <Router>
                <Routes>
                    <Route exact path="/" component={ProductList} />
                    <Route exact path="/addUser" component={AddUser} />
                    <Route exact path="/viewUsers" component={ViewUsers} />
                    <Route exact path="/searchUsers" component={SearchUsers} />
                    <Route exact path="/productList" component={ProductList} />
                    <Route exact path="/testPage" component={TestPage} />
                    <Route exact path="/employeeList" component={EmployeeList} />
                    <Route exact path="/userList" component={UserList} />
                </Routes>
            </Router>
        );
    }
}

export default App;