cd odd-api
mvn clean package
docker build -t odd-api .
cd ..
cd even-api
mvn clean package
docker build -t even-api .
cd ..
cd kafka-api
mvn clean package
docker build -t kafka-api .
cd ..
cd main-api
mvn clean package
docker build -t main-api .
docker-compose up
