import React from 'react'
import {Form, Button} from 'react-bootstrap';
import { FORM_NAME, FORM_EMAIL, FORM_PASSWORD, createAccount, ACCOUNT_API_URL } from '../util/constants'

class SignUp extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            name: '',
            email: '',
            password: ''
        };
    }

    mySubmitHandler = async (event) => {
        event.preventDefault();

        const data = createAccount(this.state.name, this.state.email, this.state.password);

        console.log(JSON.stringify(data))
        const headers = new Headers({
            "Content-Type": "application/json",
            "Content-Length": JSON.stringify(data).length
        });
        const options = {
            method: "POST",
            headers: headers,
            body: JSON.stringify(data)
        };
        await fetch(ACCOUNT_API_URL, options).then(function (response) {
            if(response.status === 200) {
                console.log('Account created')
                console.log(response)
                response.text().then(function (text) {
                    // do something with the text response
                    console.log(text)
                });
            } else {
                // display modal
            }
        });

    }

    myChangeHandler = (event) => {
        let stateId = event.target.id;
        console.log(stateId)
        switch (stateId) {
            case(FORM_NAME):
                this.setState({name: event.target.value});
                break;
            case(FORM_EMAIL):
                this.setState({email: event.target.value});
                break;
            case(FORM_PASSWORD):
                this.setState({password: event.target.value});
                break;
            default:
                break;
        }
    }

    render() {
        return (
            <form onSubmit={this.mySubmitHandler}>
                <Form.Group controlId={FORM_NAME}>
                    <Form.Label>Name</Form.Label>
                    <Form.Control onChange={this.myChangeHandler} type="text" placeholder="Name" />
                </Form.Group>
                <Form.Group controlId={FORM_EMAIL}>
                    <Form.Label>Email address</Form.Label>
                    <Form.Control onChange={this.myChangeHandler} type="email" placeholder="Enter email" />
                    <Form.Text className="text-muted">
                        We'll never share your email with anyone else.
                    </Form.Text>
                </Form.Group>
                <Form.Group controlId={FORM_PASSWORD}>
                    <Form.Label>Password</Form.Label>
                    <Form.Control onChange={this.myChangeHandler} type="password" placeholder="Password" />
                </Form.Group>
                <Form.Group controlId="formBasicCheckbox">
                    <Form.Check type="checkbox" label="Check me out" />
                </Form.Group>
                <Button variant="primary" type="submit">
                    Submit
                </Button>
            </form>
        );
    }
}

export default SignUp