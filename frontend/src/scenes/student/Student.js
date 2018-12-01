import React, { Component } from 'react';
import { Grid, Image, Divider, Card, Icon } from 'semantic-ui-react';
import * as styles from './Student.css';
import STUDENT from '../../resources/student-logo.svg';

class Student extends Component {
  render() {
    return (
      <Grid divided className="fullHeight">
        <Grid.Row>
          <Grid.Column width={4} className="pt-50">
            <Card fluid>
              <Image src={STUDENT} size="small" centered circular />
              <Card.Content textAlign="center">
                <Card.Header>Sena Kavukcu</Card.Header>
                <Card.Content>11596035</Card.Content>
              </Card.Content>
              <Card.Content textAlign="center">
                <Icon name="book" />
                6/B
              </Card.Content>
            </Card>
          </Grid.Column>
          <Grid.Column width={12}>
            <Image src="https://picsum.photos/300/300" />
          </Grid.Column>
        </Grid.Row>
      </Grid>
    );
  }
}

export default Student;
