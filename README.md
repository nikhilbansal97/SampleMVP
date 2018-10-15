# SampleMVVM

This is a sample app that follows the Model-View-ViewModel Architecture

## What is Model-View-ViewModel Architecture ?

* **View**: A view only knows about how to display the data. It does not know anything about the business logic of the app (i.e. They are dumb!). It never interacts directly with the model for receiving or updating the data. In most cases the view is the `Activity` or `Fragment`. The app has a `view` package which has the `MainActivity` as view.
* **ViewModel**: A viewmodel acts as a medium between the `View` and `MainActivityService`. ViewModel store and manage UI-related data in a lifecycle conscious way. The ViewModel class allows data to survive configuration changes such as screen rotations. It is responsible for both updating the data in the service according to user interaction and updating the UI when the data is updated. The app contains the `viewmodel` package which has the `MainActivityViewModel` class.
* **Model**: This is the data holder class for the app. All the data is kept inside a model. This class does not interact with the view class. When the model is updated, the viewmodel is notified. The app contains a `model` package that has a `MainActivityModel`.

## How will the layers talk to each other ?

As all the layers are separated by different classes/packages.

* **MainActivityService**: expose `MainActivityModel` data through observables (LiveData) to be decoupled completely from ViewModel.

* **MainActivityViewModel**: interacts with model via `MainActivityService` and also prepares observable that can be observed by a View. ViewModel provide hooks for the view to pass events (increment button clicks) to the service.

* **MainActivity**: Finally, the view role in this pattern is to observe (or subscribe to) `MainActivityViewModel` observable to get data in order to update UI elements accordingly. Click events are passed to the ViewModel via a method call but it can be implemented with an observable which coud replace button onCLickListener.