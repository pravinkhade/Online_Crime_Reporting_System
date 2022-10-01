import{createStore, combineReducers, applyMiddleware } from 'redux'
import {userSignupReducer, userSigninReducer} from './reducers/userReducers'
import logger from 'redux-logger'
import thunk from 'redux-thunk'
import { composeWithDevTools } from 'redux-devtools-extension'

const reducers= combineReducers ({
    userSignup: userSignupReducer,
    userSignin: userSigninReducer,
})

const store = createStore(reducers, composeWithDevTools(applyMiddleware (logger, thunk)))

export default store