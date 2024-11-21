# selenium-test-IKEA

In terminal open the project's folder and run:
```
docker compose up
```
After that start the built container and run:
```
docker exec -it ikea-kitchen-configurator-ubuntu-1 bash
```

Open a browser with the following URL: http://localhost:8081/

Then navigate to the tests folder in the previously used terminal and run:
```
gradle test
```
The tests should be running in the browser.
