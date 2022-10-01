import { Link } from 'react-router-dom'
const PoliceNav= (props)=> {
   return (
    <nav className="navbar navbar-expand-lg navbar-light bg-light">
    <div className="container-fluid">
    
      <Link to="/annual_complaint">
        <span className="navbar-brand">Annual Report</span>
      </Link>
      <Link to="/solved_complaints">
        <span className="navbar-brand"> Solved Complaints</span>
      </Link>
      <Link to="/search">
        <span className="navbar-brand">Search Record</span>
      </Link>
      
      <Link to="/signin">
        <span className="navbar-brand">Logout</span>
      </Link>
     
      

      </div>
      </nav>
   )
}
export default PoliceNav