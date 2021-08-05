if size == 0
        error: underflow
    x = Q[head]           // copy our element for return
    head = head + 1       // Shift the head to its new location
    size = size - 1       // Update the number of elements in the queue
    if head == capacity   // Check for wraparound
        head = 0
    return x


if size == capacity   // check for overflow
        expandQueue()
    Q[tail] = x           // copy our new item into the queue
    tail = tail + 1       // shift the tail to its new location
    size = size + 1       // update the number of elements in the queue
    if tail == length(Q)  // Check for wrap-around
        tail = 0
