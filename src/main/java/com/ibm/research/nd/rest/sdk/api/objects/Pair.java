package com.ibm.research.nd.rest.sdk.api.objects;

public class Pair<L, R>
{
  private L left;
  private R right;

  public Pair()
  {

  }

  public Pair(L left, R right)
  {
    this.left = left;
    this.right = right;
  }

  public L getLeft()
  {
    return this.left;
  }

  public void setLeft(L left)
  {
    this.left = left;
  }

  public R getRight()
  {
    return this.right;
  }

  public void setRight(R right)
  {
    this.right = right;
  }

  @Override
  public int hashCode()
  {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.left == null) ? 0 : this.left.hashCode());
    result = prime * result + ((this.right == null) ? 0 : this.right.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj)
  {
    if (this == obj)
    {
      return true;
    }
    if (obj == null)
    {
      return false;
    }
    if (this.getClass() != obj.getClass())
    {
      return false;
    }
    Pair other = (Pair) obj;
    if (this.left == null)
    {
      if (other.left != null)
      {
        return false;
      }
    }
    else if (!this.left.equals(other.left))
    {
      return false;
    }
    if (this.right == null)
    {
      if (other.right != null)
      {
        return false;
      }
    }
    else if (!this.right.equals(other.right))
    {
      return false;
    }
    return true;
  }
}
