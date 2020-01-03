import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import Navbar from './navBar'
import Home from './home'
import { Container, Row, Col } from 'react-bootstrap';


class App extends React.Component {
    render() {
        return (

            <Container>
                <Row>
                    <Col><Navbar/></Col>
                </Row>
                <Row>
                    <Col><Container><Home/></Container></Col>
                </Row>
            </Container>
        )
    }
}

export default App;
