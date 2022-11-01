# Hadoop

## BigData

Big data is a collection of large datasets that cannot be processed using traditional computing techniques. It is
not a single technique or a tool, rather it has become a complete subject, which involves various tools, techniques
and frameworks.

- Structured data - Relational data.
- Semi Structured data - XML data.
- Unstructured data - Word, PDF, Text, Media Logs.

### Properties

- Volume
    - huge volume of data in terabytes
- Velocity
- Variety
- Veracity
- Value

## Hadoop

![hadoop](img/hadoop.png)

Apache Hadoop is a collection of open-source software utilities that
facilitates using a network of many computers to solve problems involving
massive amounts of data and computation.

At its core, Hadoop has two major layers namely

- Processing/Computation layer (MapReduce), and
- Storage layer (Hadoop Distributed File System).

### Ecosystem

- Hadoop Common
    - contains libraries and utilities needed by the other hadoop modules
- Hadoop Distributed file system (HDFS)
    - distributed file system that stores data on commodity hardware machines,
      providing very high aggregates bandwidth across the cluster
- Hadoop YARN
    - platform responsible for managing computing resources in clusters and using them
      for scheduling users applications
- Hadoop MapReduce
    - an implementation of the MapReduce programming model for large scale data processing
- Hadoop Ozone
    - an object store for hadoop

- Apache Cassandra
    - NoSQL DBMS constructed to manage huge volumes of data spread across numerous
      commodity servers, delivering high availability.

## MapReduce

MapReduce is a parallel programming model for writing distributed applications devised at Google for efficient
processing of large amounts of data (multi-terabyte data-sets), on large clusters (thousands of nodes) of commodity
hardware in a reliable, fault-tolerant manner. The MapReduce program runs on Hadoop which is an Apache open-source
framework.

## HDFS - Hadoop Distributed File System

- NameNode
    - master daemon
    - maintains and manages datanode records metadata, e.g. location of block stored, the size of
      the files, permissions, hierarchy, etc.
    - receives heartbeat and block report form all the DataNode
- DataNode
    - Slave deamons
    - stores actual data
    - serves read and write requests

The Hadoop Distributed File System (HDFS) is based on the Google File System (GFS) and provides a distributed file
system that is designed to run on commodity hardware. It has many similarities with existing distributed file
systems. However, the differences from other distributed file systems are significant. It is highly fault-tolerant
and is designed to be deployed on low-cost hardware. It provides high throughput access to application data and is
suitable for applications having large datasets.

## Hadoop Common

These are Java libraries and utilities required by other Hadoop modules.

## Hadoop YARN

This is a framework for job scheduling and cluster resource management.

- resource manager
- node manager
