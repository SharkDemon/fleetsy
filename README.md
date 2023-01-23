# Fleetsy

[![HitCount](http://hits.dwyl.com/SharkDemon/fleetsy.svg)](http://hits.dwyl.com/SharkDemon/fleetsy)

Fleetsy is a simple web application to help organizations manage their vehicle fleets, and is my submission for Demonhacks 2020.

## Technologies Used

The backend was made with Java 11, Spring Boot 2.3.4, and Spring Data. Flyway was used to populate a 3-node [CockroachDB](https://www.cockroachlabs.com/) cluster. The frontend was created in HTML/CSS using [Thymeleaf](https://www.thymeleaf.org/) and [Bootstrap](https://getbootstrap.com/).

## TODOs

Of course lots more can be accomplished, but omitted for time.

* Add CRUD support for Organizations
* Add simple UI for Organizations
* Add CRUD support for Vehicles
* Add simple UI for Vehicles
* Add table/data for ServiceProviders
* Add CRUD support for Services
* Add simple UI for Services
* Add Dockerfile for fleetsynet
* More elaborate indexes for searching Vehicles
* Organization authentication
* Add favicon
* Add organization logo to Vehicles page
* Add fields for Vehicle license plate information (state, number)
* Add optional field for Vehicle city license sticker
* Sortable columns for the Service History page
