
import './App.css';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import SigninScreen from './screens/SigninScreen';
import CitizenCornerScreen from './screens/CitizenCornerScreen';
import ContactUsScreen from './screens/ContactUsScreen';
import AboutusScreen from './screens/AboutusScreen';
import PoliceHomeScreen from './screens/PoliceHomeScreen';
import UserHomeScreen from './screens/UserHomeScreen';
import AdminHomeScreen from './screens/AdminHomeScreen';
import HomeScreen from './screens/HomeScreen';
import SignupScreen from './screens/SignupScreen';
import AddComplaintScreen from './screens/AddComplaintScreen';
import ComplaintScreen from './screens/ComplaintScreen';
import ViewComplaintStatusScreen from './screens/ViewComplaintStatusScreen';


import FeedbackScreen from './screens/FeedbackScreen';
import AddComplaintVehicleScreen from './screens/AddComplaintVehicleScreen';
import AddComplaintArticleScreen from './screens/AddComplaintArticleScreen';
import AddComplaintPersonScreen from './screens/AddComplaintPersonScreen';

import Navigation from './components/Navigation';
import UpdateInfoScreen from './screens/UpdateInfoScreen';
import AnnualComplaintScreen from './screens/AnnualComplaintScreen';
import SolvedComplaintsScreen from './screens/SolvedCompliantsScreen';
import SearchRecordScreen from './screens/SearchRecordScreen'
import PoliceDetailsScreen from './screens/PoliceDetailsScreen';
import AddPoliceScreen from './screens/AddPoliceScreen';
import AnnualReportScreen from './screens/AnnualReportScreen';
import SolvedComplaintsAdminScreen from './screens/SolvedComplaintsAdminScreen';
import SearchRecordAdminScreen from './screens/SearchRecordAdminScreen';
import ViewFeedbackScreen from './screens/ViewFeedbackScreen';
import LogoutScreen from './screens/LogoutScreen';
function App() {
  return (
    <div>
      <Router>
        <Navigation />

        <Switch>
          <div className="container mt-3">
            <Route path="/signin" component={SigninScreen} />
            <Route path="/logout" component={LogoutScreen} />
            <Route path="/signup" component={SignupScreen} />
            <Route path="/home" component={HomeScreen} />
            <Route path="/admin_home" component={AdminHomeScreen} />
            <Route path="/user_home" component={UserHomeScreen} />
            <Route path="/police_home" component={PoliceHomeScreen} />
            <Route path="/about_us" component={AboutusScreen} />
            <Route path="/citizen_corner" component={CitizenCornerScreen} />
            <Route path="/contact_us" component={ContactUsScreen} />
            <Route path="/add_complaint" component={AddComplaintScreen} />
            <Route path="/view_complaint_status" component={ViewComplaintStatusScreen} />
            <Route path="/Update_Info" component={UpdateInfoScreen} />
            <Route path="/feedback" component={FeedbackScreen} />
            <Route path="/add_vehicle_complaint" component={AddComplaintVehicleScreen} />
            <Route path="/add_article_complaint" component={AddComplaintArticleScreen} />
            <Route path="/person_complaint" component={AddComplaintPersonScreen} />
            <Route path="/annual_complaint" component={AnnualComplaintScreen} />
            <Route path="/Solved_complaints" component={SolvedComplaintsScreen} />
            <Route path="/search" component={SearchRecordScreen} />
            <Route path="/police_details" component={PoliceDetailsScreen} />
            <Route path="/add_police" component={AddPoliceScreen} />
            <Route path="/annual_report" component={AnnualReportScreen} />
            <Route path="/asolved_complaints" component={SolvedComplaintsAdminScreen} />
            <Route path="/a_search" component={SearchRecordAdminScreen} />
            <Route path="/view_feedback" component={ViewFeedbackScreen} />
            <Route path="/complaint/:id" component={ComplaintScreen} />
          </div>
        </Switch>
      </Router>
    </div>
  );
}

export default App;
