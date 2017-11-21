import models.{Node, Node2}

object Main extends App {
  val first: Node = Node(1)
  val first2: Node2 = Node2(1)

  val second: Node = Node(2)
  val second2: Node2 = Node2(2)

  val thrid: Node = Node(3)
  val thrid2: Node2 = Node2(3)

  val fourth: Node = Node(4)
  val fourth2: Node2 = Node2(4)

  first.next = second
  first2.nextNode = second2

  second.next = thrid
  second2.nextNode = thrid2

  thrid.next = fourth
  thrid2.nextNode = fourth2

  fourth.next = null
  fourth2.nextNode = null

  val linkedList: LinkedList = new LinkedList
  val linkedList2: LinkedList2 = new LinkedList2

  println(linkedList.isLoop(first))
  println(Console.GREEN + linkedList2.isLoop(first2) + Console.RESET)
}