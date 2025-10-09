package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.ComputerDesktop: ImageVector
    get() {
        if (_ComputerDesktop != null) {
            return _ComputerDesktop!!
        }
        _ComputerDesktop = ImageVector.Builder(
            name = "Filled.ComputerDesktop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.25f, 5.25f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(13.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                lineTo(21.75f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(0.257f)
                curveToRelative(0f, 0.597f, 0.237f, 1.17f, 0.659f, 1.591f)
                lineToRelative(0.621f, 0.622f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.53f, 1.28f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.53f, -1.28f)
                lineToRelative(0.621f, -0.622f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.659f, -1.59f)
                lineTo(8.25f, 18f)
                horizontalLineToRelative(-3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(2.25f, 5.25f)
                close()
                moveTo(3.75f, 5.25f)
                verticalLineToRelative(7.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 1.5f)
                horizontalLineToRelative(13.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -1.5f)
                verticalLineToRelative(-7.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
                lineTo(5.25f, 3.75f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
                close()
            }
        }.build()

        return _ComputerDesktop!!
    }

@Suppress("ObjectPropertyName")
private var _ComputerDesktop: ImageVector? = null
