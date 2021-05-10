import React, { Component } from "react";
import { Route, BrowserRouter as Router } from "react-router-dom";
import AddUser from "./Components/AddUser";
import ViewUsers from "./Components/ViewUsers";
import SearchUsers from "./Components/SearchUsers";
import ProductList from "./Components/ProductList";

class App extends Component {
  render() {
    return (
      <Router>
        <Route exact path="/" component={ProductList} />
        <Route exact path="/addUser" component={AddUser} />
        <Route exact path="/viewUsers" component={ViewUsers} />
        <Route exact path="/searchUsers" component={SearchUsers} />
      </Router>
    );
  }
}

export default App;