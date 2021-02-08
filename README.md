# animated-carnival
An example using Prometheus and Grafana to monitor a Spring Boot microservice.

### Build & Run
- Be sure to set `targets` in `prometheus/prometheus.yml` config file to your local IP address
- `docker-compose up --build`

### Prometheus
- Verify Prometheus target is up: http://localhost:9090/targets

### Grafana
- http://localhost:3000/login
    - default local username/pw: `admin`/`admin`
    - choose `Skip` when prompted to set new admin pw
- Add Prometheus datasource
    -`http://localhost:9090` 
    - set `Access` to `Browser` 
- Import the [JVM (Micrometer) Dashboard](https://grafana.com/grafana/dashboards/4701) (ID 4701)

### Test API
- `curl 'http://localhost:8080/addresses' | jq`

### Resources
- [Monitoring Spring Boot with Prometheus and Grafana](https://ordina-jworks.github.io/monitoring/2020/11/16/monitoring-spring-prometheus-grafana.html)