import React from 'react';
import {Card, Container} from 'react-bootstrap';
import SignUp from './signup'

class Home extends React.Component {
    render() {
        return (
            <Card>
                <Card.Header as="h5">Sign Up</Card.Header>
                <Card.Body>
                    <Card.Title>Create an account</Card.Title>
                    <Card.Text>
                        Create an account to create & manage your team or simply just join a team.
                    </Card.Text>
                    <Container><SignUp/></Container>
                </Card.Body>
            </Card>
        )
    }
}

export default Home