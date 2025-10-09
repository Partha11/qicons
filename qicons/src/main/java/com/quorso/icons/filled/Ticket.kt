package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Ticket: ImageVector
    get() {
        if (_Ticket != null) {
            return _Ticket!!
        }
        _Ticket = ImageVector.Builder(
            name = "Filled.Ticket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.5f, 6.375f)
                curveToRelative(0f, -1.036f, 0.84f, -1.875f, 1.875f, -1.875f)
                horizontalLineToRelative(17.25f)
                curveToRelative(1.035f, 0f, 1.875f, 0.84f, 1.875f, 1.875f)
                verticalLineToRelative(3.026f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.375f, 0.65f)
                arcToRelative(2.249f, 2.249f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.898f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.375f, 0.65f)
                verticalLineToRelative(3.026f)
                curveToRelative(0f, 1.035f, -0.84f, 1.875f, -1.875f, 1.875f)
                lineTo(3.375f, 19.5f)
                arcTo(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 17.625f)
                verticalLineToRelative(-3.026f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.374f, -0.65f)
                arcToRelative(2.249f, 2.249f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.898f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.374f, -0.65f)
                lineTo(1.5f, 6.375f)
                close()
                moveTo(16.5f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                lineTo(15.75f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                close()
                moveTo(17.25f, 9.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(16.5f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                close()
                moveTo(17.25f, 17.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                lineTo(15.75f, 18f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(6f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                lineTo(12f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                lineTo(6.75f, 12.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 12f)
                close()
                moveTo(6.75f, 14.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.build()

        return _Ticket!!
    }

@Suppress("ObjectPropertyName")
private var _Ticket: ImageVector? = null
