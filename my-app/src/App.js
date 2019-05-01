import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import carshow from './carshow';


class App extends Component {
    render() {
        return (
            <Router>
                <Switch>
                    <Route path='/' exact={true} component={carshow}/>
                </Switch>
            </Router>
        )
    }
}

export default App;