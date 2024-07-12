FROM chucknorrisio/postgres AS chuck-db

FROM postgres:16.3-alpine

ENV POSTGRES_PASSWORD=postgres
ENV POSTGRES_USER=postgres
ENV POSTGRES_DB=chuck

COPY --from=chuck-db  '/docker-entrypoint-initdb.d/' '/docker-entrypoint-initdb.d/'
