CREATE TABLE GITHUB_PROJECT(
    id  IDENTITY NOT NULL PRIMARY KEY,
    repo_name VARCHAR(50) NOT NULL UNIQUE,
    org_name  VARCHAR(50) NOT NULL
);