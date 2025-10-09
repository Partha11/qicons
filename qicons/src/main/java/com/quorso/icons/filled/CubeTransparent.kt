package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.CubeTransparent: ImageVector
    get() {
        if (_CubeTransparent != null) {
            return _CubeTransparent!!
        }
        _CubeTransparent = ImageVector.Builder(
            name = "Filled.CubeTransparent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.622f, 1.602f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.756f, 0f)
                lineToRelative(2.25f, 1.313f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.756f, 1.295f)
                lineTo(12f, 3.118f)
                lineTo(10.128f, 4.21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.756f, -1.295f)
                lineToRelative(2.25f, -1.313f)
                close()
                moveTo(5.898f, 5.81f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.27f, 1.025f)
                lineToRelative(-1.14f, 0.665f)
                lineToRelative(1.14f, 0.665f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.756f, 1.295f)
                lineTo(3.75f, 8.806f)
                verticalLineToRelative(0.944f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                lineTo(2.25f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.372f, -0.648f)
                lineToRelative(2.25f, -1.312f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.026f, 0.27f)
                close()
                moveTo(18.102f, 5.81f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.026f, -0.27f)
                lineToRelative(2.25f, 1.312f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.372f, 0.648f)
                verticalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-0.944f)
                lineToRelative(-1.122f, 0.654f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.756f, -1.295f)
                lineToRelative(1.14f, -0.665f)
                lineToRelative(-1.14f, -0.665f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.27f, -1.025f)
                close()
                moveTo(9.102f, 11.06f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.026f, -0.27f)
                lineTo(12f, 11.882f)
                lineToRelative(1.872f, -1.092f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.756f, 1.295f)
                lineToRelative(-1.878f, 1.096f)
                lineTo(12.75f, 15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-1.82f)
                lineToRelative(-1.878f, -1.095f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.27f, -1.025f)
                close()
                moveTo(3f, 13.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(1.82f)
                lineToRelative(1.878f, 1.095f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.756f, 1.295f)
                lineToRelative(-2.25f, -1.312f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.372f, -0.648f)
                verticalLineToRelative(-2.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 13.5f)
                close()
                moveTo(21f, 13.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.372f, 0.648f)
                lineToRelative(-2.25f, 1.312f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.756f, -1.295f)
                lineToRelative(1.878f, -1.096f)
                lineTo(20.25f, 14.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                close()
                moveTo(12f, 18.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(0.944f)
                lineToRelative(1.122f, -0.654f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.756f, 1.295f)
                lineToRelative(-2.25f, 1.313f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.756f, 0f)
                lineToRelative(-2.25f, -1.313f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.756f, -1.295f)
                lineToRelative(1.122f, 0.654f)
                lineTo(11.25f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                close()
            }
        }.build()

        return _CubeTransparent!!
    }

@Suppress("ObjectPropertyName")
private var _CubeTransparent: ImageVector? = null
