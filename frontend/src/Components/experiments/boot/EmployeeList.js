import React from "react";
import Table from 'react-bootstrap/Table'
import { Button, Modal, Container, Row, Col } from "react-bootstrap";
import CreateEmployee from "./CreateEmployee";

class EmployeeRow extends React.Component{

    constructor(props){
        super(props);
        this.state = {
            show: false
        };
        this.handleClose = this.handleClose.bind(this);
        this.handleShow = this.handleShow.bind(this);
    }

    handleClose = function(){
        this.setState({
            show: false
        });
    }

    handleShow = function(){
        this.setState({
            show: true
        });
    }

    render(){
        let component = this;

        return (
            <tr>
                <td>{component.props.data.id}</td>
                <td>{component.props.data.firstName}</td>
                <td>{component.props.data.lastName}</td>
                <td>{component.props.data.dob}</td>
                <td>{component.props.data.gender}</td>
                <td>{component.props.data.primaryEmail}</td>
                <td>
                    <>
                        <Button variant="primary" onClick={component.handleShow}>
                            Details
                        </Button>
                
                        <Modal show={component.state.show} onHide={component.handleClose}>
                            <Modal.Header closeButton>
                                <Modal.Title>Employee Details View</Modal.Title>
                            </Modal.Header>
                            <Modal.Body>
                                <p><span>ID : {component.props.data.id}</span></p>
                                <p><span>FIRST NAME: {component.props.data.firstName}</span></p>
                                <p><span>LAST NAME: {component.props.data.lastName}</span></p>
                                <p><span>DOB: {component.props.data.dob}</span></p>
                                <p><span>GENDER: {component.props.data.gender}</span></p>
                                <p><span>EMAIL: {component.props.data.primaryEmail}</span></p>
                            </Modal.Body>
                            <Modal.Footer>
                                <Button variant="secondary" onClick={component.handleClose}>
                                Close
                                </Button>
                                <Button variant="primary" onClick={component.handleClose}>
                                Save Changes
                                </Button>
                            </Modal.Footer>
                        </Modal>
                    </>
                </td>
            </tr>
        );
    }

}


class EmployeeList extends React.Component{
    
    constructor(props){
        super(props);
        this.state = {
            data: [],
            firstLoad: true,
            createEmployeeModalView: false
        }
        this.upDateData = this.upDateData.bind(this);
        this.setLoad = this.setLoad.bind(this);
        this.showCreateEmployee = this.showCreateEmployee.bind(this);
        this.hideCreateEmployee = this.hideCreateEmployee.bind(this);
        this.createEmployee = this.createEmployee.bind(this);
    }

    componentDidUpdate(prevProps, prevState, snapshot){
        console.log("I am observing !!!!");
    }

    upDateData(data){
        this.setState({
            data: data
        });
    }

    setLoad(firstLoad){
        this.setState({
            firstLoad: firstLoad
        });
    }

    showCreateEmployee(){
        this.setState({
            createEmployeeModalView: true
        });
    }

    hideCreateEmployee(){
        this.setState({
            createEmployeeModalView: false
        });
    }

    createEmployee(employee){
        this.setState({
            data : this.state.data.concat(employee),
            createEmployeeModalView: false
        });
        alert("I worked !!");
    }

    render() {
        var component = this;

        let data = component.state.data;
        let firstLoad = component.state.firstLoad;
        let isLoading = true;
    
        async function sampleFunc() {
          let response = await fetch("/api/user");
          let body = await response.json();
          component.upDateData(body);
        }
      
        if (firstLoad) {
          sampleFunc();
          component.setLoad(false);
        }
      
        if (data.length > 0){
          isLoading = false;
        }

        return (
            <div>
                <Container fluid="md">
                    <Row>
                        <Col><h3>EMPLOYEE LIST</h3></Col>
                        <Col>
                            <>
                                <Button variant="primary" onClick={() => component.showCreateEmployee(true)}>
                                    Create New User
                                </Button>
                                <CreateEmployee show={component.state.createEmployeeModalView} onHide={() => component.hideCreateEmployee(false)} onSave={() => component.createEmployee()} />
                            </>
                        </Col>
                    </Row>
                    <Row>
                        <Col>
                            {isLoading ? (
                                <h4>Error loading data !!</h4>
                            ) : (
                                <Table striped bordered hover>
                                    <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>First Name</th>
                                            <th>Last Name</th>
                                            <th>Dob</th>
                                            <th>Gender</th>
                                            <th>Primary Email</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        {data?.map(row => {
                                            return <EmployeeRow data = {row}/>;
                                        })}
                                    </tbody>
                                </Table>
                            )}
                        </Col>
                    </Row>
                </Container>      
          </div>
        );
    }
}
export default EmployeeList;