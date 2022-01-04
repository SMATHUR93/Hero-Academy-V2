import React, { Component } from "react";
import { Route, BrowserRouter as Router } from "react-router-dom";
import AddUser from "./Components/experiments/AddUser";
import ViewUsers from "./Components/experiments/ViewUsers";
import SearchUsers from "./Components/experiments/SearchUsers";
import ProductList from "./Components/experiments/ProductList";
import TestPage from "./Components/experiments/TestPage";
import UserList from "./Components/UserList";

class App extends Component {
  render() {
    return (
      <Router>
        <Route exact path="/" component={UserList} />
        <Route exact path="/addUser" component={AddUser} />
        <Route exact path="/viewUsers" component={ViewUsers} />
        <Route exact path="/searchUsers" component={SearchUsers} />
        <Route exact path="/productList" component={ProductList} />
        <Route exact path="/testPage" component={TestPage} />
        <Route exact path="/userList" component={UserList} />
      </Router>
    );
  }
}

export default App;