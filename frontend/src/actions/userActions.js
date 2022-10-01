import {USER_SIGNIN_FAIL,
    USER_SIGNIN_REQUEST,
    USER_SIGNIN_SUCCESS, USER_SIGNOUT, USER_SIGNUP_FAIL, USER_SIGNUP_REQUEST, USER_SIGNUP_SUCCESS } from "../constants/userConstants"
import axios from 'axios'

export const logout = () => {
    return (dispatch) => {
      sessionStorage.removeItem('token')
      dispatch({ type: USER_SIGNOUT })
      document.location.href = '/signin'
    }
  }


export const signup = (userFirstName, userLastName, userEmail, userContact, userPassword) => {
    return (dispatch) => {
        dispatch ({
            type: USER_SIGNUP_REQUEST
        })
          
        const header = {
            headers: {
                'Content-Type': 'application/json'
            }
        }
        const body = {
            userFirstName,
            userLastName,
            userEmail,
            userContact,
            userPassword
        }
        const url = "http://localhost:7070/user/signup"
        axios.post(url,body,header)
        .then((response)=>{
            dispatch({
                type:USER_SIGNUP_SUCCESS,
                payload: response
            })
            window.location.assign("/signin")
        })
        .catch((error) =>{
            dispatch({
                type:USER_SIGNUP_FAIL,
                payload: error
            })
        })
    }
}

export const signin = (userEmail, userPassword, type) => {
    return (dispatch) => {
      dispatch({
        type: USER_SIGNIN_REQUEST,
      })
  
      const header = {
        headers: {
          'Content-Type': 'application/json',
        },
      }

      const body = {
        userEmail,
        userPassword,
      }
      
      const url = `http://localhost:7070/${type}/signin`
      axios
        .post(url, body, header)
        .then((response) => {
          dispatch({

            type: USER_SIGNIN_SUCCESS,
            payload: response.data,

          })
          window.location.assign(`/${type}_home`)
        })
        .catch((error) => {
          dispatch({
            type: USER_SIGNIN_FAIL,
            payload: error,
          })
        })
    }
  }

  export const get_vehicle_complaints = () => {
    return (dispatch) => {
      const header = {
        headers: {
            'Content-Type': 'application/json'
        }
      }
      const url = "http://localhost:7070/police/vehicle_complaints"
      axios.post(url,header)
        .then((response)=>{
            dispatch({
                type:USER_SIGNUP_SUCCESS,
                payload: response
            })
        })
        .catch((error) =>{
            dispatch({
                type:USER_SIGNUP_FAIL,
                payload: error
            })
        })
    }
  }

  export const add_vehicle_complaint = (compVehicleNo, compVehicleName, compVehicleModel, compVehicleDescription, compName, compEmail, compContact, compAddress, compReportType, compDateTime, compArea, compDistrict, compState, compPincode) => {
    return (dispatch) => {
        dispatch ({
            type: USER_SIGNUP_REQUEST
        })
          
        const header = {
            headers: {
                'Content-Type': 'application/json'
            }
        }
        const body = {
            compVehicleNo,
            compVehicleName,
            compVehicleModel,
            compVehicleDescription,
            compName,
            compEmail,
            compContact,
            compAddress,
            compReportType,
            compDateTime,
            compArea,
            compDistrict,
            compState,
            compPincode
        }
        const url = "http://localhost:7070/user/complaintvehicle"
        axios.post(url,body,header)
        .then((response)=>{
            dispatch({
                type:USER_SIGNUP_SUCCESS,
                payload: response
            })
            window.location.assign("/add_complaint")
        })
        .catch((error) =>{
            dispatch({
                type:USER_SIGNUP_FAIL,
                payload: error
            })
        })
    }
}
