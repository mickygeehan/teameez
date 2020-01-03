import React from 'react'

class SignUp extends React.Component {
    constructor(props) {
        super(props);
        this.state = { firstName: '',
        lastName: ''};
    }
     mySubmitHandler = async (event) => {
        event.preventDefault();
        const apiUrl = 'accounts/v2/accounts';
        const data = {
            firstName: this.state.firstName,
            lastName: this.state.lastName
        };
        const headers = new Headers({
            "Content-Type": "application/json",
            "Content-Length": JSON.stringify(data).length
        });
        const options = {
            method: "POST",
            headers: headers,
            body: JSON.stringify(data)
        };
        const response = await fetch(apiUrl, options);
    }
    myChangeHandler = (event) => {
        this.setState({firstName: event.target.value});
    }

    myChangeHandler2 = (event) => {
        this.setState({lastName: event.target.value});
    }

    render() {
        return (
            <form onSubmit={this.mySubmitHandler}>
                <p>Enter your firstname, and submit:</p>
                <input
                    type='text'
                    onChange={this.myChangeHandler}
                />
                <input
                    type='text'
                    onChange={this.myChangeHandler2}
                />
                <input
                    type='submit'
                />
            </form>
        );
    }

}

export default SignUp