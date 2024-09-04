# WFHp

This will be a product for remote employees to organize and gather at their favorite cafes/workspaces

## Data Schema

let's DynamoDB this time and do 1 users table with 2 types

Users:
  type: Workers
    open_to_social: bool
    employer
    industry
    img_url
  type: Locations
    (location admin user acct w/ publicly visible properties)
    hours
    address
    is_public (false for company offices)
    number_of_seats
  Checkins (visited) - intended to be future (ui on app open "going in to the office tomorrow?")

later:
friends (coworkers? types of relationships?)
reviews
ratings
messages

