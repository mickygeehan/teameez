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
                        By creating an account you can create a team and or manage a team.
                    </Card.Text>
                    <Container><SignUp/></Container>
                </Card.Body>
            </Card>
        )
    }
}

export default Home