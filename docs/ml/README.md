# Machine Learning

## Resources

- <https://www.youtube.com/channel/UC7p_I0qxYZP94vhesuLAWNA/videos>
- <https://www.youtube.com/channel/UCxsqJMTD-yOe277vtQIRjgw>
- <https://www.geeksforgeeks.org/machine-learning/>

## Where to get data

- [https://archive.ics.uci.edu/ml/datasets.php](https://archive.ics.uci.edu/ml/datasets.php)
- [https://data.gov.in/](https://data.gov.in/catalogs/)
- [https://www.kaggle.com/](https://www.kaggle.com/)

## Introduction

- Understanding and building methods that learn that is methods that
  leverage data to improve performance on some set of tasks.
- It is seen as a part of artificial intelligence.
- ML algorithms build a model based on sample data (training data) in order
  to make predictions or decisions without being explicitly programmed to do so.

- A subset of ML is closely related to computational statistics
    - focuses on making predictions using computers
    - but not all ML is statistical learning

- The study of mathematical optimization delivers methods, theory and application
  domain to the field of machine learning.

- Data mining is a related field of study, focusing on **exploratory data analysis**
  through unsupervised learning.

- Some implementations of ML use data and neural networks in a way that mimics the working of biological brain.
- In its application across business problems, ML is also referred to as **predictive analysis**.

## Outline

- Problems
    - Classification
    - Regression
    - Clustering
    - Dimension reduction
    - density estimation
    - Anomaly detection
    - Data Cleaning
    - AutoML
    - Association rules
    - Structured prediction
    - Feature engineering
    - Feature learning
    - Online learning
    - Reinforcement learning
    - Supervised learning
    - Semi-supervised learning
    - Unsupervised learning
    - Learning to rank
    - Grammar induction
- Supervised learning (classification, regression)
    - Decision tree
    - Ensembles
        - Bagging
        - Boosting
        - Random forest
    - k-NN
    - Linear Regression
    - Naive Bayes
    - Artificial Neural Networks
    - Logistic regression
    - Preceptron
    - Relevance vector machine (RVM)
    - Support vector machine (SVM)
- Clustering
    - BIRCH
    - CURE
    - Hierarchial
    - k-means
    - Fuzzy
    - Expectation-maximization (EM)
    - DBSCAN
    - OPTICS
    - Mean shift
- Dimensionality reduction
    - Factor analysis
    - CCA
    - ICA
    - LDA
    - NMF
    - PCA
    - PGD
    - t-SNE
- Structured Prediction
    - Graphical models
        - Bayes net
        - Conditional random field
        - Hidden Markov
- Anomaly detection
    - k-NN
    - Local outlier factor
    - Isolation forest
- Artificial neural network
    - Autoencoder
    - Cognitive computing
    - Deep learning
    - DeepDream
    - Multilayer perceptron
    - RNN
        - LSTM
        - GRU
        - ESN
        - reservoir computing
    - Restricted Boltzmann machine
    - GAN
    - SOM
    - Convolutional neural network (U-Net)
    - Transformer (Vision)
    - Spiking neural network
    - Memtransistor
    - Electrochemical RAM (ECRAM)
- Reinforcement learning
- Learning with humans
- Model diagnostics
- Theory
    - Kernel machines
    - Bias-variance tradeoff
    - Computational learning theory
    - Empirical risk minimization
    - Occam learning
    - PAC learning
    - Statistical learning
    - VC theory
- Machine learning venues

## Classification

- Supervised Learning
- Deep Neural Networks
- Dimensionality Reduction
- Unsupervised Learning
- Probabilistic Graphic Methods
- Sequential Learning
- Causal Inference
- Reinforcement Learning

On basis of the nature of the learning signal or feedback available to a learning system

- Supervised learning
- Unsupervised learning
- Semi-supervised learning
- Reinforcement learning

On the basis of output desired from a machine learned system

- Classification
- Regression
- Clustering
- Density estimation
- Dimensionality reduction

Terminologies of Machine Learning

- Model
- Feature
- Target (Label)
- Training
- Prediction

## Libraries

- `pandas`
    - first you want to load the data, for that you require pandas
    - it converts the csv file you have into data frames
- `matplotlib`, `seaborn`, `plotly`
    - these are for visualizing the data you have
- `numpy`
    - when you want to convert your data into more compact usable for
    - like numpy array which is faster than the normal list of python
- `scipy`
    - when you want to perform some scientific calculations on the data
    - like calculating the ode, fft, integration and differentiation
- `scikit-learn`
    - this library contains list of algorithms used in machine learning
    - like classification, regression, etc
- `tensorflow`
    - if you want to make some neural networks, then you will need tensorflow
- `keras`
    - its api to interact with tensorflow, you need to use keras, which is module inside
    tensorflow.

Theses are basically all the libraries you will need for machine learning.

- **PyTorch** is an open source machine learning framework based on the Torch library,
    - used for applications such as
        - computer vision and
        - natural language processing,
        - primarily developed by Meta AI.
        - `pip install pytorch`
- **TensorFlow** is a free and open-source software library
    - for machine learning
    - and artificial intelligence.
    - It can be used across a range of tasks but has a
        - particular focus on training and inference of deep neural networks
    - `pip install tensorflow`
- **OpenCV** is a library of programming functions mainly aimed at real-time computer vision.
    - `pip install opencv-python`
- **NumPy** is a library for the Python programming language,
    - adding support for large, multi-dimensional arrays and matrices,
    - along with a large collection of high-level mathematical functions to operate on these arrays.
    - `pip install numpy`
- **SciPy** is a free and open-source Python library used for scientific computing and technical computing.
    - SciPy contains modules for
        - optimization,
        - linear algebra,
        - integration,
        - interpolation,
        - special functions,
        - FFT,
        - signal and
        - image processing,
        - ODE solvers and
        - other tasks common in science and engineering.
    - `pip install scipy`
- **Keras** is an open-source software library that provides a Python interface
    - for artificial neural networks.
    - Keras acts as an interface for the TensorFlow library.
    - Up until version 2.3, Keras supported multiple backends, including
        - TensorFlow,
        - Microsoft Cognitive Toolkit,
        - Theano, and
        - PlaidML
- **Scikit-learn** is a free software machine learning library for the Python programming language.
    - It features various
        - classification,
        - regression and
        - clustering algorithms including
            - support-vector machines,
            - random forests,
            - gradient boosting,
            - k-means and
            - DBSCAN,
    - and is designed to interoperate with the Python numerical and scientific libraries
        - NumPy and SciPy.
- **Matplotlib** is a plotting library for the Python programming language
    - and its numerical mathematics extension NumPy.
    - It provides an object-oriented API for embedding plots into applications
        - using general-purpose GUI toolkits like
            - Tkinter,
            - wxPython,
            - Qt, or
            - GTK.
- **pandas** is a software library written for the Python programming language
    - for data manipulation and analysis.
    - In particular, it offers data structures and operations for manipulating
        - numerical tables and time series.
