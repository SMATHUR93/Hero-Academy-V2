import React from "react";
import { Button, Modal, Row, Col } from "react-bootstrap";
import Form from 'react-bootstrap/Form'

export default function CreateEmployee(props) {
  const [id, setId] = React.useState("");
  const [firstName, setFirstName] = React.useState("");
  const [lastName, setLastName] = React.useState("");
  const [dob, setDob] = React.useState(
    new Date("1993-02-25T21:11:54")
  );
  const [gender, setGender] = React.useState("");
  const [primaryEmail, setPrimaryEmail] = React.useState("");

  return (
    <Modal {...props}>
        <Modal.Header closeButton>
            <Modal.Title>Employee Creation Form</Modal.Title>
        </Modal.Header>
        <Modal.Body>

          <Form>
            <Form.Group as={Row} className="mb-3" controlId="id">
              <Form.Label column sm={2}>
                Id
              </Form.Label>
              <Col sm={10}>
                <Form.Control type="number" placeholder="ID" value={id}
          onChange={e => setId(e.target.value)}/>
              </Col>
            </Form.Group>

            <Row className="mb-3">
              <Form.Group as={Col} controlId="firstName">
                <Form.Label>First Name</Form.Label>
                <Form.Control type="text" placeholder="Enter First Name" value={firstName}
          onChange={e => setFirstName(e.target.value)}/>
              </Form.Group>

              <Form.Group as={Col} controlId="lastName">
                <Form.Label>Last Name</Form.Label>
                <Form.Control type="text" placeholder="Enter Last Name" value={lastName}
          onChange={e => setLastName(e.target.value)}/>
              </Form.Group>
            </Row>

            <Form.Group as={Row} className="mb-3" controlId="dob">
              <Form.Label column sm={2}>
                Date of Birth
              </Form.Label>
              <Col sm={10}>
                <Form.Control type="date" placeholder="DOB" value={dob}
          onChange={e => setDob(e.target.value)}/>
              </Col>
            </Form.Group>

            <Form.Group as={Row} className="mb-3" controlId="gender">
              <Form.Label column sm={2}>
                Gender
              </Form.Label>
              <Col sm={10}>
                <Form.Control type="text" placeholder="gender" value={gender}
          onChange={e => setGender(e.target.value)}/>
              </Col>
            </Form.Group>

            <Form.Group as={Row} className="mb-3" controlId="primaryEmail">
              <Form.Label column sm={2}>
                Email
              </Form.Label>
              <Col sm={10}>
                <Form.Control type="email" placeholder="Email" value={primaryEmail}
          onChange={e => setPrimaryEmail(e.target.value)}/>
              </Col>
            </Form.Group>

            <Button variant="primary" type="submit">
            {/* onClick={props.onSave({ id, firstName, lastName, dob, gender, primaryEmail })} */}
              Save Changes
            </Button>
          </Form>
        </Modal.Body>
        <Modal.Footer>
            <Button variant="secondary" onClick={props.onHide}>
            Close
            </Button>
            {/* <Button variant="primary" onClick={props.onHide}>
            Save Changes
            </Button> */}
        </Modal.Footer>
    </Modal>
  );
}