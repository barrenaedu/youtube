# Requirement 0002: Monthly sales reports.md

## Overview
We need to modify our REST API service to add monthly sales reports.

## Requirements
- Implement the endpoint GET /{customerId}/reports/sales?customer={customerId}&date={date}
- The service should return a downloable pdf file with the sales to a customer. The url parameters are {customerId} and {date}, where parameter {date} is in the format YYYYMM (for digits for the year + two digits for the month).

## Deliverables
1. Project structure (folders, main files)
2. Database schema
3. Code implementation
