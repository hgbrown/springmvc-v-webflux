# Contact DB

Creates and runs a container for the postgres database required by this project.

The rest of the docker commands in this README describes building and running the database as a standalone container. Of course, this will require you to manually run the application to connect to this database container.

## Building this image

```shell
docker image build -t henrygbrown/db-contact .
```

## Running the container

```shell
docker run --name db-contact -e PGDATA=/tmp -d -p 15432:5432 -v ${PWD}:/var/lib/postgresql/data henrygbrown/db-contact
```

## Access psql in running container

```shell
docker exec -it db-contact psql -U postgres -d contact_db
```

## Test Data
On start-up the container will create the schema and populate it with some test data.
Some common queries to see the characteristics of the test data:

```sql
select count(*) from contact;
```
