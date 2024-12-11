/**
 * Invoke the callback and return the amount of time in miliseconds it took to execute
 */
exports.profileFunc = function (cb) {
    const startTime = Date.now();
    cb();
    const endTime = Date.now();
    return endTime - startTime;
};

/**
 * Invoke the async callback with the provided value after some delay
 */
exports.returnWithDelay = function (value, delay, cb) {
    setTimeout(() => {
        try {
          cb(null, value);
        } catch (err) {
          cb(err);
        }
      }, delay);
};

/**
 * Invoke the async callback with an error after some delay
 */
exports.failWithDelay = function (delay, cb) {
    setTimeout(() => {
        cb(new Error('Delayed error'));
      }, delay);
};

/**
 * Return a promise that resolves after the specified delay
 * or rejects if the delay is negative or non-existent
 */
exports.promiseBasedDelay = function (delay) {if (delay < 0 || typeof delay !== 'number') {
    return Promise.reject(new Error('Invalid delay'));
  }
  return new Promise((resolve) => {
    setTimeout(resolve, delay);
  });
};
