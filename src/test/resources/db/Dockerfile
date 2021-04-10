FROM postgres:10.16-alpine

LABEL author="Henry Brown"

ENV POSTGRES_USERNAME postgres
ENV POSTGRES_PASSWORD postgres
ENV POSTGRES_DB contact_db

COPY sql/ docker-entrypoint-initdb.d/
