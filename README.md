# Fleetsy

Fleetsy is a simple web application to help organizations manage their vehicle fleets, and is my submission for Demonhacks 2020.

The backend was made with Java 11 and Spring Boot 2.3.4. Flyway was used to populate a 3-node [CockroachDB](https://www.cockroachlabs.com/) cluster. The frontend was created with [Thymeleaf](https://www.thymeleaf.org/) and [Bootstrap](https://getbootstrap.com/).

TODOs
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
