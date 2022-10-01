


import {  MDBContainer,MDBFooter} from "mdbreact";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import {
 
  faFacebook,
  faTwitter,
  faInstagram
} from "@fortawesome/free-brands-svg-icons";




const HomeScreen = (props)=> {
    return (
        
            <div >
               
               <div class="lf-container">
          <h4><u>Lost/Found</u></h4><hr/>
          <p>
          This application is for providing Lost and Found Information to Police. Information reported under this application is not a subject matter of enquiry/investigation. False report to Police is a punishable offence. Reporting person shall be solely responsible for any false information. Dial 100, if there is any emergency.
          </p>
        </div>
        
        <div class="cp-container">
        <h4><u>From CP's Desk</u></h4><hr/>
        <p>
           Police shall ensure the Rule of Law, enforce the law of the land impartially and firmly without fear or favour, and strive to create a fear free environment that is conducive to growth and development.
        </p>
        <p>
        Police will remain committed to maintaining public order, preventing and detecting crime, maintaining and promoting communal harmony, ensuring a smooth flow of traffic, and taking strong action against terrorism, organized crime, anti-social / illicit activities / elements.
        </p>
        </div>
        <div class="social-container">
            <h4><u>Social Media</u></h4><hr/>
            <a href="https://www.facebook.com/"
                className="facebook social">
               <FontAwesomeIcon icon={faFacebook} size="2x"/>
            </a>
            <a href="https://www.twitter.com/" className="twitter social">
                <FontAwesomeIcon icon={faTwitter} size="2x"/> 
            </a>
            <a href="https://www.instagram.com/"
              className="instagram social">
              <FontAwesomeIcon icon={faInstagram} size="2x"/>
            </a>
           
        </div>


        <MDBFooter>
           <div className="footer-copyright ">
        <MDBContainer fluid>
           &copy; {new Date().getFullYear()} Copyright :  Crime Report System
        </MDBContainer>
      </div>
        </MDBFooter>




   
              
      
        </div>
    )
}

export default HomeScreen 