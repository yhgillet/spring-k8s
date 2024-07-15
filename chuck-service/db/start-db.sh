 docker build -t chuckdb .

 docker run -p '6432:5432' --name chuck-db chuckdb:latest