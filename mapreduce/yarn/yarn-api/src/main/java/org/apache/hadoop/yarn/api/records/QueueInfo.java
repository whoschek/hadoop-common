package org.apache.hadoop.yarn.api.records;

import java.util.List;

public interface QueueInfo {
  String getQueueName();
  void setQueueName(String queueName);
  
  float getCapacity();
  void setCapacity(float capacity);
  
  float getMaximumCapacity();
  void setMaximumCapacity(float maximumCapacity);
  
  float getCurrentCapacity();
  void setCurrentCapacity(float currentCapacity);
  
  List<QueueInfo> getChildQueues();
  void setChildQueues(List<QueueInfo> childQueues);
  
  List<Application> getApplications();
  void setApplications(List<Application> applications);
  
  QueueState getQueueState();
  void setQueueState(QueueState queueState);
}
