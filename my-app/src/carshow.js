import React, { Component } from 'react';
import { Button, ButtonGroup, Container, Table } from 'reactstrap';
import { Collapse, Nav, Navbar, NavbarBrand, NavbarToggler, NavItem, NavLink } from 'reactstrap';
class carshow extends Component {

    constructor(props) {
        super(props);
        this.state = {cars: [], isLoading: false, isError: false};
    }

    componentDidMount() {
        this.setState({isLoading: true});

        fetch('api/carshow')
            .then(response => response.json()
                , (error) => {if (error) {this.setState({isLoading: false, isError:true});}} )
            .then(data => this.setState({cars: data, isLoading: false})
                , (error) => {if (error){this.setState({isLoading: false, isError:true});}});


    }

    render() {
        const {cars, isLoading, isError} = this.state;
        if (isLoading) {
            return <p>Loading...</p>;
        }
        if (isError){
            return <div class="alert-warning">
                <h5>Cannot get car & show data from server</h5>
            </div>;
        }

        const carList = cars.map(car => {
            return <tr>
                <td style={{whiteSpace: 'nowrap'}}>{car.make}</td>
                <td>{car.model}</td>
                <td>{car.shows.map(show => {
                    return <tr style={{borderColor: 'white'}}><td style={{borderColor: 'white'}}>{show}</td></tr>})}</td>
            </tr>
        });

        return (
            <div>
                <Navbar color="light" dark expand="md">
                    <NavbarBrand><h2 color="grey" >Car Show</h2></NavbarBrand>
                </Navbar>
                <Container fluid>
                    <Table className="mt-4">
                        <thead>
                        <tr>
                            <th width="20%">Make</th>
                            <th width="20%">Model</th>
                            <th width="60%">Shows</th>
                        </tr>
                        </thead>
                        <tbody>
                        {carList}
                        </tbody>
                    </Table>
                </Container>
            </div>
        );
    }
}

export default carshow;