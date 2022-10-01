// import "../../App.css"
import React, { Component } from 'react'

class LogoutScreen extends Component {

  constructor(props) {
    super(props)
    this.changeStatus = this.changeStatus.bind(this);
}

componentDidMount() {
    this.changeStatus();
  }

changeStatus(st) {
    sessionStorage.removeItem('token');
    this.props.history.push('/signin');
  } 


    render(){
      return (
        <div>
           <h5>!!! Successfully Logout !!!</h5>
        </div>
     );
    }   
}
export default LogoutScreen