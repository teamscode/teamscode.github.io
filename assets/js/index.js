class ArrowMoJS extends mojs.CustomShape {
  getShape() {
    return '<path d="M 28,48 68,48"></path><path d="M 70,48 66,50 66,46 Z"></path>';
  }
}

mojs.addShape('arrow', ArrowMoJS);

class Graph {
  constructor() {
    this.nodes = [];
    this.edges = [];
  }

  addNode(node) {
    this.nodes.push(node);
  }

  addEdge(idA, idB) {
    var nodeA = this.nodes[idA];
    var nodeB = this.nodes[idB];

    var left = (nodeA.left + nodeB.left) / 2;
    var top = (nodeA.top + nodeB.top) / 2;

    var ratio = (nodeA.top - nodeB.top) / (nodeA.left - nodeB.left);
    var angle = Math.atan(ratio) / Math.PI * 180;

    var edge = new Edge(top, left, angle);

    this.edges.push(edge);
    nodeA.neighbors.push(nodeB);
  }

  render() {
    this.nodes.forEach(function(node) {
      node.render();
    });

    this.edges.forEach(function(edge) {
      edge.render();
    });
  }

  _dfs(stack, visited) {
    if (stack.length <= 0) return;

    var node = stack.pop();
    var that = this;

    if (!visited[node.id]) {
      visited[node.id] = true;
      node.neighbors.forEach(function(neighbor) {
        stack.push(neighbor);
      });
      node.shape.play().then(setTimeout(function() {
        that._dfs(stack, visited)
      }, 1000));
    }
  }

  dfs() {
    var first = this.nodes[0];
    var stack = [ first ];
    var visited = {};

    this._dfs(stack, visited);
  }
}

class Node {
  constructor(top, left, id) {
    this.top = top;
    this.left = left;
    this.id = id;
    this.neighbors = [];
  }

  render() {
    this.shape = new mojs.Shape({
      parent: '.index-header-animation',
      className: 'index-header-animation-circle',
      shape: 'circle',
      isShowStart: true,
      fill: { '#448AFF': '#00C853', easing: 'cubic.in' },
      stroke: { '#BBDEFB': '#B9F6CA', easing: 'cubic.in' },
      strokeWidth: { 6: 8, easing: 'cubic.in' },
      radius: 16,
      top: this.top,
      left: this.left,
      scale: 1,
      duration: 1000
    });
  }
};

class Edge {
  constructor(top, left, angle, id) {
    this.top = top;
    this.left = left;
    this.angle = angle;
    this.id = id;
  }

  render() {
    this.shape = new mojs.Shape({
      parent: '.index-header-animation',
      className: 'index-header-animation-arrow',
      shape: 'arrow',
      isShowStart: true,
      fill: '#444444',
      stroke: '#444444',
      strokeWidth: 4,
      top: this.top,
      left: this.left,
      angle: this.angle
    });
  }
}

var graph = new Graph();

graph.addNode(new Node(40, 20, 0));
graph.addNode(new Node(40, 120, 1));
graph.addNode(new Node(0, 220, 2));
graph.addNode(new Node(80, 220, 3));
graph.addNode(new Node(0, 320, 4));

graph.addEdge(0, 1);
graph.addEdge(1, 2);
graph.addEdge(1, 3);
graph.addEdge(2, 4);

graph.render();
graph.dfs();

$('.index-header-animation-info button').click(function() {
  graph.dfs();
});