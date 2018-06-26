# SampleMVP
This is a sample app that follows the Model View Presenter Architecture

### What is MVP Architecture?

* **View**: A view only knows about how to display the data. It does not know anything about the business logic of the app (i.e. They are dumb!). It never interacts directly with the model for receiving or updating the data. In most cases the view is the `Activity` or `Fragment`. The app has a `view` package which has the `MainActivity` as view.
* **Presenter**: A presenter acts as a medium between the `View` and `Model`. Presenter knows about both view and model. It is responsible for both updating the data in the model according to user interaction and updating the UI when the data is updated. The app contains the `presenter` package which has the `MainActivityPresenter` class.
* **Model**: This is the data holder class for the app. All the data is kept here. This class does not interact with the view class. When the model is updated, the presenter is notified. The app contains a `model` package that has a `MainActivityModel` class.

### How will the layers talk to each other?
As all the layers are separated by different classes/packages. Different layers talk to each other using `interface`. The project contains an `ContractInterface` which houses the rules for all the interfaces the layers will implement.
* **View Interface**: This interface is implemented by the `View` of the app. It contains all the methods necessary to populate and update the views. The methods will be called by the presenter when the UI needs to be initialized/updated.
* **Presenter Interface**: This interface is implemented by the `Presenter` of the app. It contains the methods that will used to connect both `View` and `Model`. The methods declared will be called by both the layers.
* **Model Interface**: This interface is implemented by the `Model` of the app. It contains methods that will used to get/update the data of the app. The methods will be called by the presenter to access/modify the data.

