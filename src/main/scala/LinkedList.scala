import models.Node

// Wrong answer in case isn't loop but still return true
class LinkedList {
  def isLoop(root: Node): Boolean = {
    var flag: Boolean = true
    var result: Boolean = false

    var turtle: Node = root
    var rabbit: Node = root

    while(flag){
      if(turtle == null || rabbit == null){
        result = false
        flag = false
      } else if(turtle == rabbit) {
        result = true
        flag = false
      } else {
        turtle = turtle.next
        rabbit = rabbit.next.next
      }
    }

    result
  }
}