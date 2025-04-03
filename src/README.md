# Homework 5: Proxy and Flyweight Patterns

## 1. Implementation of the Proxy pattern
### Problem Statement:

In a real estate agency image management system, agents upload high-definition images of properties. However, the website should load full-size images only when the user requests them (e.g. when zooming in), and display low-resolution thumbnails by default.
### Solution using the Proxy pattern:

- The Proxy class acts as a proxy for the real image and loads it only when needed.

- This approach optimizes performance by saving memory and reducing network load.

- You can also use Protection Proxy, which limits the ability to load images to authorized agents only.

RealImage - downloads high resolution images.
ProxyImage - lazy loading.
AuthProxyImage - restricts access to image uploads

### How the pattern helps:

Proxy Pattern improves performance by preventing unnecessary loading of high-resolution images.

Protection Proxy improves system security by restricting access to image management.

## 2. Implementation of the Flyweight pattern
### Problem Statement:

A map application displays thousands of location markers (gas stations, restaurants, hospitals). Each marker has a common style (icon, color, text style). Storing a large number of duplicate styles increases memory consumption.
### Solution using Flyweight pattern:

- Flyweight Factory stores label styles and reuses them to reduce memory consumption.

- This avoids creating many duplicate objects.

LocIconStyle - a lightweight class for storing label styles
IconStyleFactory - a light weight class for storing label styles
LocationMarker - map marker using a common style.

### How the pattern helps:

Flyweight Pattern reduces memory consumption by caching and reusing shared objects.

The system avoids creating thousands of duplicates, which improves performance.

## Conclusion:

The Proxy and Flyweight patterns demonstrate how software architecture can be optimized:
- The Proxy Pattern improves resource efficiency by lazy loading objects and managing access.
- The Flyweight Pattern reduces memory costs by using shared objects.
