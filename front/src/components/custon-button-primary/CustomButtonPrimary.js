import React, { Component } from 'react';
import './CustomButtonPrimary.css'

export default class CustomButtonPrimay extends Component{
    render() {
        let texto = "teste"
        return(
            <button id="button_primary" class="btn">{texto}</button>
        )
    }
}