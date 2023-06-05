<!--
SPDX-FileCopyrightText: NOI Techpark <digital@noi.bz.it>

SPDX-License-Identifier: CC0-1.0
-->

# Open Data Hub: Web Component Store

This repository contains the source code of the Open Data Hub Web Component
Store. It is a store to collect and preview our web components. 

[![CI/CD data-service (api)](https://github.com/noi-techpark/it.bz.opendatahub.webcomponents/actions/workflows/data-service.yml/badge.svg)](https://github.com/noi-techpark/it.bz.opendatahub.webcomponents/actions/workflows/data-service.yml)
[![CI/CD delivery-service (cdn)](https://github.com/noi-techpark/it.bz.opendatahub.webcomponents/actions/workflows/delivery-service.yml/badge.svg)](https://github.com/noi-techpark/it.bz.opendatahub.webcomponents/actions/workflows/delivery-service.yml)
[![CI/CD frontend](https://github.com/noi-techpark/it.bz.opendatahub.webcomponents/actions/workflows/frontend.yml/badge.svg)](https://github.com/noi-techpark/it.bz.opendatahub.webcomponents/actions/workflows/frontend.yml)

Functionalities are as follows: 
  - Search 
  - Filter
  - Configure and preview
  - Copy a code snippet to be integrated in your web page 

In addition, it connects the source code of each web component to the actual
representation. 

This repository is divided into two sub-projects, namely:
  - [frontend](frontend/README.md)
  - [backend](backend/README.md)

## Local webcomponent development
To test your webcomponent locally you can start an instance of the store on your local machine and deploy your created webcomponent to it.  

To start it follow these steps:
- `cp .env.example .env`
- Adjust .env with your values for WC_PATH (the absolute path of you webcomponent)
- Adjust ports in .env if they have conflicts with services already running on your machine
- `docker-compose up -d`
- Wait until the containers are running. You can check the current state with  
  `docker-compose logs --tail 400 -f`  
  (or simply wait until your computer fan gets silent again ;-) )
- Access the store on `localhost:8999` (or the port you defined) and you'll see your webcomponent

To publish a new version of your webcomponent:
- Increase version number WC_VERSION in your .env file
- `docker-compose up wcstore-cli` 

To stop and delete everything:
- `docker-compose stop`
- in case you want to delete your test do `[sudo] rm -f workspace` and `docker-compose rm -f -v`
