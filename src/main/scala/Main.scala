import models.Node

object Main extends App {
  val first: Node = Node(1)

  val second: Node = Node(2)

  val thrid: Node = Node(3)

  val fourth: Node = Node(4)

  first.next = second

  second.next = thrid

  thrid.next = fourth

  fourth.next = first

  val linkedList: LinkedList = new LinkedList

  println(linkedList.isLoop(first))
}