import React, { Component } from "react";
import { Route, BrowserRouter as Router } from "react-router-dom";

class Product extends React.Component {

  constructor(props){
    super(props);
    this.state = {
        quantity : 0
    }
    this.buy = this.buy.bind(this);
    this.show = this.show.bind(this);
  }

  buy() {
    this.setState({
        quantity: (this.state.quantity + 1)
    });
    this.props.handleTotal(this.props.price);
  }

  show(){
    this.props.handleShow(this.props.name)
  }

  render() {
    return (
      <div>
        <p>{this.props.name} - ${this.props.price}</p>
        <button onClick={this.buy}>Buy</button>
        <button onClick={this.show}>Show</button>
        <h3>Quantity : {this.state.quantity} Item(s)</h3>
        <hr/>
      </div>
    );
  }
}

class ProductForm extends React.Component {
  constructor(props){
    super(props);
    this.submit = this.submit.bind(this);
  }

  submit(e){
    e.preventDefault();
    console.log("Name = "+this.refs.name.value+" -  Price = $"+this.refs.price.value);
    var product = {
        name : this.refs.name.value,
        price : parseInt(this.refs.price.value)
    };
    this.props.handleCreate(product);
    this.refs.name.value = "";
    this.refs.price.value = "";
  }
  render() {
    return (
      <form onSubmit={this.submit}>
        <br/>
        <input type="text" placeholder="Product Name" ref="name"/>
        <input type="text" placeholder="Product Price" ref="price"/>
        <br/>
        <button>Create Product</button>
        <hr/>
      </form>
    );
  }
}

class Total extends React.Component {
  render() {
    return (
      <div>
        <h3>Total Cash : ${this.props.total}</h3>
      </div>
    );
  }
}

class ProductList extends React.Component {

  constructor(props){
    super(props);
    this.state = {
        total : 0,
        productList: [{
            name: "abc",
            price: 12
        },{
            name: "def",
            price: 34
        },{
            name: "ghi",
            price: 56
        }]
    }
    this.calculateTotal = this.calculateTotal.bind(this);
    this.createProduct = this.createProduct.bind(this);
  }

  componentDidUpdate(prevProps, prevState, snapshot){
    console.log("I am observing !!!!");
  }

  showProduct(name) {
    alert("you selected : "+name);
  }

  calculateTotal(price){
    this.setState({
        total: this.state.total+price
    })
  }

  createProduct(product){
    this.setState({
        productList : this.state.productList.concat(product)
    });
  }

  render() {
    var component = this;
    var products = this.state.productList.map(function(product){
        return <Product name={product.name} price={product.price} handleShow={component.showProduct} handleTotal={component.calculateTotal}/>;
    });
    return (
      <div>
        <h1>Hello, world!</h1>
        <h2>It is {new Date().toLocaleTimeString()}.</h2>
        <hr/>
        <ProductForm handleCreate={this.createProduct}/>
        {products}
        <Total total={this.state.total}/>
      </div>
    );
  }
}

export default ProductList;