package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.LinkSlash: ImageVector
    get() {
        if (_LinkSlash != null) {
            return _LinkSlash!!
        }
        _LinkSlash = ImageVector.Builder(
            name = "Filled.LinkSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.892f, 4.09f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.303f, 0f)
                lineToRelative(-4.5f, 4.5f)
                curveToRelative(-0.074f, 0.074f, -0.144f, 0.15f, -0.21f, 0.229f)
                lineToRelative(4.965f, 4.966f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.986f, -4.428f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.646f, -1.353f)
                arcToRelative(5.253f, 5.253f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.502f, 6.944f)
                lineToRelative(5.515f, 5.515f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.061f, 1.06f)
                lineToRelative(-18f, -18.001f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.521f, 2.46f)
                lineToRelative(5.294f, 5.295f)
                arcToRelative(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.213f, -0.227f)
                lineToRelative(4.5f, -4.5f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.425f, 7.425f)
                lineToRelative(-1.757f, 1.757f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(1.756f, -1.757f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5.304f)
                close()
                moveTo(5.846f, 11.773f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.06f)
                lineToRelative(-1.757f, 1.758f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.303f, 5.304f)
                lineToRelative(3.129f, -3.13f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.06f, 1.061f)
                lineToRelative(-3.128f, 3.13f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7.425f, -7.426f)
                lineToRelative(1.757f, -1.757f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.061f, 0f)
                close()
                moveTo(8.247f, 12.033f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.957f, 0.458f)
                curveToRelative(0.18f, 0.512f, 0.474f, 0.992f, 0.885f, 1.403f)
                curveToRelative(0.31f, 0.311f, 0.661f, 0.555f, 1.035f, 0.733f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.647f, 1.354f)
                arcToRelative(5.244f, 5.244f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.449f, -1.026f)
                arcToRelative(5.232f, 5.232f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.24f, -1.965f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.46f, -0.957f)
                close()
            }
        }.build()

        return _LinkSlash!!
    }

@Suppress("ObjectPropertyName")
private var _LinkSlash: ImageVector? = null
