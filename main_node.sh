. /etc/bashrc
cd ~/io
module load plgrid/tools/sbt/0.13.9
module load plgrid/tools/java8/oracle/1.8.0
sbt "io/run --nodeId $1"
